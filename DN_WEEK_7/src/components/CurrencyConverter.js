import React, { useState } from 'react';

const CurrencyConverter = () => {
  // Step 4a: State for input and converted values
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');
  const [conversionRate] = useState(0.011); // 1 INR = 0.011 EUR (approximate)

  // Step 4b: Handle input change using synthetic event
  const handleInputChange = (event) => {
    const value = event.target.value;
    
    // Synthetic event properties
    console.log('Input event type:', event.type);
    console.log('Input value:', value);
    
    // Update state
    setRupees(value);
    
    // Clear euros when input changes
    setEuros('');
  };

  // Step 4c: Handle convert button click
  const handleConvert = (event) => {
    // Prevent default if needed
    event.preventDefault();
    
    console.log('Convert button clicked');
    console.log('Synthetic event details:', {
      type: event.type,
      target: event.target.tagName,
      bubbles: event.bubbles
    });

    // Convert INR to EUR
    if (rupees && !isNaN(rupees)) {
      const convertedValue = (parseFloat(rupees) * conversionRate).toFixed(2);
      setEuros(convertedValue);
    } else {
      alert('Please enter a valid amount in rupees');
    }
  };

  // Step 4d: Handle form submit
  const handleFormSubmit = (event) => {
    event.preventDefault(); // Prevent form submission
    handleConvert(event);
  };

  // Step 4e: Handle reset
  const handleReset = (event) => {
    console.log('Reset clicked:', event.type);
    setRupees('');
    setEuros('');
  };

  return (
    <div style={{
      padding: '20px',
      border: '2px solid #2196F3',
      borderRadius: '10px',
      margin: '20px',
      backgroundColor: '#f0f8ff'
    }}>
      <h2>Currency Converter (INR to EUR)</h2>
      <p>Convert Indian Rupees to Euros using React synthetic events</p>

      <form onSubmit={handleFormSubmit} style={{ marginTop: '20px' }}>
        <div style={{ marginBottom: '15px' }}>
          <label htmlFor="rupees" style={{ 
            display: 'block', 
            marginBottom: '5px',
            fontWeight: 'bold'
          }}>
            Amount in Indian Rupees (₹):
          </label>
          <input
            id="rupees"
            type="number"
            value={rupees}
            onChange={handleInputChange}
            placeholder="Enter amount in rupees"
            style={{
              width: '100%',
              padding: '10px',
              fontSize: '16px',
              border: '1px solid #ccc',
              borderRadius: '4px',
              maxWidth: '300px'
            }}
            onFocus={(e) => {
              console.log('Input focused:', e.type);
              e.target.style.borderColor = '#2196F3';
            }}
            onBlur={(e) => {
              console.log('Input blurred:', e.type);
              e.target.style.borderColor = '#ccc';
            }}
          />
        </div>

        <div style={{ marginBottom: '15px' }}>
          <button
            type="button"
            onClick={handleConvert}
            style={{
              backgroundColor: '#2196F3',
              color: 'white',
              padding: '12px 24px',
              fontSize: '16px',
              border: 'none',
              borderRadius: '5px',
              cursor: 'pointer',
              marginRight: '10px'
            }}
          >
            Convert to EUR
          </button>

          <button
            type="button"
            onClick={handleReset}
            style={{
              backgroundColor: '#ff4444',
              color: 'white',
              padding: '12px 24px',
              fontSize: '16px',
              border: 'none',
              borderRadius: '5px',
              cursor: 'pointer'
            }}
          >
            Reset
          </button>
        </div>

        {euros && (
          <div style={{
            backgroundColor: '#4CAF50',
            color: 'white',
            padding: '15px',
            borderRadius: '5px',
            marginTop: '15px'
          }}>
            <h3>Conversion Result:</h3>
            <p style={{ fontSize: '18px', margin: '5px 0' }}>
              ₹{rupees} = €{euros}
            </p>
            <p style={{ fontSize: '12px', opacity: '0.8' }}>
              Exchange Rate: 1 INR = {conversionRate} EUR
            </p>
          </div>
        )}
      </form>

      <div style={{ 
        marginTop: '20px', 
        fontSize: '14px', 
        color: '#666',
        textAlign: 'left'
      }}>
        <h4>Synthetic Events Used:</h4>
        <ul>
          <li><strong>onChange</strong> - Input value changes</li>
          <li><strong>onClick</strong> - Button clicks</li>
          <li><strong>onSubmit</strong> - Form submission</li>
          <li><strong>onFocus/onBlur</strong> - Input focus events</li>
        </ul>
      </div>
    </div>
  );
};

export default CurrencyConverter;
