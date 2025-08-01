import React from "react";
import "./App.css";

function App() {
  const title = "Office Space , at Affordable Range";

  const offices = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image:
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS60mHjfYCI_wmRIbjVmq83g1ULf6dYnyG_3w&s",
    },
    {
      Name: "SharePlace",
      Rent: 75000,
      Address: "Kolkata",
      Image:
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLe4GmRON8mAKtUofgE3IVB15ua-unX3upvg&s",
    },
    {
      Name: "TechHub",
      Rent: 45000,
      Address: "Bangalore",
      Image:
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPw5qFZU15WERgy-NqA0WykulDviJBsYJTyQ&s",
    },
  ];

  return (
    <div style={{ padding: "30px", fontFamily: "Arial" }}>
      <h1>{title}</h1>
      {offices.map((item, index) => {
        const rentColor = item.Rent <= 60000 ? "textRed" : "textGreen";

        return (
          <div key={index} style={{ marginBottom: "40px" }}>
            <img src={item.Image} width="20%" height="20%" alt="Office Space" />
            <h2>Name: {item.Name}</h2>
            <h3 className={rentColor}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
            <hr />
          </div>
        );
      })}
    </div>
  );
}

export default App;
