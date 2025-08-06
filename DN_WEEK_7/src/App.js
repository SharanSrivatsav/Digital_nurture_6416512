import React, { useState } from 'react';
import './App.css';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';

// ES6 Arrow function for main App component
const App = () => {
  // ES6 const declaration with useState hook
  const [flag, setFlag] = useState(true);

  // ES6 Arrow function to toggle flag
  const toggleFlag = () => setFlag(!flag);

  return (
    <div className="App">
      <header className="App-header">
        <h1>🏏 ES6 Cricket App</h1>
        
        {/* Toggle Button */}
        <button 
          onClick={toggleFlag}
          style={{
            padding: '10px 20px',
            fontSize: '16px',
            backgroundColor: flag ? '#4CAF50' : '#2196F3',
            color: 'white',
            border: 'none',
            borderRadius: '5px',
            cursor: 'pointer',
            marginBottom: '20px'
          }}
        >
          Current View: {flag ? 'List of Players' : 'Indian Players'} - Click to Toggle
        </button>

        {/* Conditional rendering using simple if-else with flag variable */}
        <div style={{ width: '100%', padding: '20px' }}>
          {flag ? <ListofPlayers /> : <IndianPlayers />}
        </div>
      </header>
    </div>
  );
};

export default App;
