import React, { useState } from "react";

function App() {
  const [count, setCount] = useState(0);
  const [rupees, setRupees] = useState("");
  const [euros, setEuros] = useState("");

  const handleWelcome = () => alert("Welcome");
  const handleClick = () => alert("I was clicked");

  const convertCurrency = () => {
    const euroRate = 0.011;
    const result = (parseFloat(rupees) * euroRate).toFixed(2);
    setEuros(result);
    alert(`Converted: ₹${rupees} = €${result}`);
  };

  return (
    <div style={{ padding: "40px", fontFamily: "Arial" }}>
      <h3>Count: {count}</h3>
      <button onClick={() => setCount(count + 1)}>Increment</button>&nbsp;
      <button onClick={() => setCount(count - 1)} disabled={count === 0}>
        Decrement
      </button>
      &nbsp;
      <button onClick={() => alert("Hello Member1")}>Click for Message</button>
      <hr />
      <button onClick={handleWelcome}>Say Welcome</button>&nbsp;
      <button onClick={handleClick}>Click Me</button>
      <hr />
      <h2 style={{ color: "green" }}>Currency Converter!!!</h2>
      <div>
        <h3>Convert Rupees to Euros</h3>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          placeholder="Enter amount in INR"
        />
        <button onClick={convertCurrency}>Convert</button>
        <h4>Equivalent in Euros: €{euros}</h4>
      </div>
    </div>
  );
}

export default App;
