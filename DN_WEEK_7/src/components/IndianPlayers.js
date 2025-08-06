import React from 'react';

const IndianPlayers = () => {
  // Step 3a: Array for destructuring demonstration
  const allPlayers = [
    "Virat Kohli", "Rohit Sharma", "KL Rahul", "Hardik Pandya",
    "Rishabh Pant", "Ravindra Jadeja", "Mohammed Shami", "Jasprit Bumrah"
  ];

  // Step 3b: Use ES6 Destructuring to separate odd and even positioned players
  const getOddEvenPlayers = () => {
    const oddPlayers = [];
    const evenPlayers = [];

    allPlayers.forEach((player, index) => {
      if (index % 2 === 0) {
        oddPlayers.push(player);
      } else {
        evenPlayers.push(player);
      }
    });

    // ES6 Destructuring assignment
    const [firstOdd, secondOdd, thirdOdd, fourthOdd] = oddPlayers;
    const [firstEven, secondEven, thirdEven, fourthEven] = evenPlayers;

    return { oddPlayers, evenPlayers };
  };

  const { oddPlayers, evenPlayers } = getOddEvenPlayers();

  // Step 3c: Declare two arrays and merge using ES6 spread operator
  const T20players = ["Virat Kohli", "Rohit Sharma", "Hardik Pandya", "KL Rahul"];
  const RanjiTrophyPlayers = ["Cheteshwar Pujara", "Ajinkya Rahane", "Mayank Agarwal", "Hanuma Vihari"];

  // ES6 Merge feature using spread operator
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Team Composition Using ES6 Destructuring</h2>
      
      <div style={{ display: 'flex', justifyContent: 'space-around', marginBottom: '20px' }}>
        <div style={{ border: '2px solid #4CAF50', padding: '15px', borderRadius: '8px' }}>
          <h3>Odd Team Players</h3>
          {oddPlayers.map((player, index) => (
            <p key={index} style={{ backgroundColor: '#e8f5e8', padding: '5px', margin: '3px' }}>
              {index + 1}. {player}
            </p>
          ))}
        </div>

        <div style={{ border: '2px solid #2196F3', padding: '15px', borderRadius: '8px' }}>
          <h3>Even Team Players</h3>
          {evenPlayers.map((player, index) => (
            <p key={index} style={{ backgroundColor: '#e3f2fd', padding: '5px', margin: '3px' }}>
              {index + 1}. {player}
            </p>
          ))}
        </div>
      </div>

      <h2>Merged Teams Using ES6 Spread Operator</h2>
      <div style={{ border: '2px solid #FF9800', padding: '15px', borderRadius: '8px', marginTop: '10px' }}>
        <h3>T20 Players</h3>
        <div style={{ display: 'flex', flexWrap: 'wrap', gap: '5px', marginBottom: '10px' }}>
          {T20players.map((player, index) => (
            <span key={index} style={{ backgroundColor: '#fff3e0', padding: '5px 10px', borderRadius: '15px' }}>
              {player}
            </span>
          ))}
        </div>

        <h3>Ranji Trophy Players</h3>
        <div style={{ display: 'flex', flexWrap: 'wrap', gap: '5px', marginBottom: '10px' }}>
          {RanjiTrophyPlayers.map((player, index) => (
            <span key={index} style={{ backgroundColor: '#fce4ec', padding: '5px 10px', borderRadius: '15px' }}>
              {player}
            </span>
          ))}
        </div>

        <h3>Combined Team (T20 + Ranji)</h3>
        <div style={{ display: 'flex', flexWrap: 'wrap', gap: '5px' }}>
          {mergedPlayers.map((player, index) => (
            <span key={index} style={{ backgroundColor: '#f3e5f5', padding: '5px 10px', borderRadius: '15px', border: '1px solid #9c27b0' }}>
              {player}
            </span>
          ))}
        </div>
      </div>
    </div>
  );
};

export default IndianPlayers;

