import React from 'react';

const ListofPlayers = () => {
  // Step 2a: Declare array with 11 players using ES6 map feature
  const players = [
    { name: "Virat Kohli", score: 85 },
    { name: "Rohit Sharma", score: 92 },
    { name: "KL Rahul", score: 65 },
    { name: "Hardik Pandya", score: 78 },
    { name: "Rishabh Pant", score: 45 },
    { name: "Ravindra Jadeja", score: 55 },
    { name: "Mohammed Shami", score: 25 },
    { name: "Jasprit Bumrah", score: 15 },
    { name: "Yuzvendra Chahal", score: 35 },
    { name: "Bhuvneshwar Kumar", score: 40 },
    { name: "Shikhar Dhawan", score: 88 }
  ];

  // Step 2b: Use map() to display all players
  const displayAllPlayers = () => {
    return players.map((player, index) => (
      <div key={index} style={{
        border: '1px solid #ccc',
        padding: '10px',
        margin: '5px',
        borderRadius: '5px'
      }}>
        <h3>{player.name}</h3>
        <p>Score: {player.score}</p>
      </div>
    ));
  };

  // Step 2c: Filter players with scores below 70 using arrow functions
  const filterLowScorePlayers = () => {
    const filteredPlayers = players.filter(player => player.score < 70);
    
    return filteredPlayers.map((player, index) => (
      <div key={index} style={{
        border: '1px solid #ff6b6b',
        padding: '10px',
        margin: '5px',
        borderRadius: '5px',
        backgroundColor: '#ffe0e0'
      }}>
        <h3>{player.name}</h3>
        <p>Score: {player.score}</p>
      </div>
    ));
  };

  return (
    <div>
      <h2>All Cricket Players</h2>
      <div style={{ display: 'flex', flexWrap: 'wrap' }}>
        {displayAllPlayers()}
      </div>
      
      <h2>Players with Scores Below 70</h2>
      <div style={{ display: 'flex', flexWrap: 'wrap' }}>
        {filterLowScorePlayers()}
      </div>
    </div>
  );
};

export default ListofPlayers;
