import React, { useState } from "react";
import GuestPage from "./components/GuestPage";
import UserPage from "./components/UserPage";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div style={{ padding: "30px", fontFamily: "Arial" }}>
      <h1>Ticket Booking App</h1>
      <div style={{ marginBottom: "20px" }}>
        {isLoggedIn ? (
          <button onClick={handleLogout} style={{ background: "red" }}>
            Logout
          </button>
        ) : (
          <button onClick={handleLogin} style={{ background: "green" }}>
            Login
          </button>
        )}
      </div>

      {isLoggedIn ? <UserPage /> : <GuestPage />}
    </div>
  );
}

export default App;
