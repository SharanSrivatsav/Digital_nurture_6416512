import React from 'react';

const WelcomeButton = () => {
  // Step 3a: Function that takes "welcome" as argument
  const handleWelcome = (message) => {
    alert(`Message: ${message}`);
    console.log('Welcome function called with:', message);
  };

  // Step 3b: Event handler using synthetic event
  const handleButtonClick = (event) => {
    // Synthetic event properties
    console.log('Event type:', event.type);
    console.log('Event target:', event.target);
    console.log('Event currentTarget:', event.currentTarget);
    
    // Call the welcome function with "welcome" argument
    handleWelcome("welcome");
  };

  return (
    <div style={{ 
      padding: '20px', 
      textAlign: 'center',
      border: '2px solid #4CAF50',
      borderRadius: '10px',
      margin: '20px',
      backgroundColor: '#f9f9f9'
    }}>
      <h2>Welcome Button Component</h2>
      <p>Click the button to trigger a synthetic event</p>
      
      <button
        onClick={handleButtonClick}
        style={{
          backgroundColor: '#4CAF50',
          color: 'white',
          padding: '12px 24px',
          fontSize: '16px',
          border: 'none',
          borderRadius: '5px',
          cursor: 'pointer',
          margin: '10px'
        }}
        onMouseEnter={(e) => {
          e.target.style.backgroundColor = '#45a049';
        }}
        onMouseLeave={(e) => {
          e.target.style.backgroundColor = '#4CAF50';
        }}
      >
        Say Welcome
      </button>
      
      <div style={{ marginTop: '10px', fontSize: '14px', color: '#666' }}>
        <p>This button uses synthetic events for:</p>
        <ul style={{ textAlign: 'left', display: 'inline-block' }}>
          <li>onClick - Main button click</li>
          <li>onMouseEnter - Hover effect</li>
          <li>onMouseLeave - Mouse leave effect</li>
        </ul>
      </div>
    </div>
  );
};

export default WelcomeButton;
