import React from "react";

export default function UserPage() {
  const handleBooking = () => alert("Ticket booked successfully!");

  return (
    <div>
      <h2>Welcome, User!</h2>
      <p>Book your flight below:</p>
      <ul style={{ display: "flex", flexDirection: "column", gap: "10px" }}>
        <li style={{ color: "blue", display: "flex", gap: "10px" }}>
          Flight 1: | Delhi → Mumbai | 10:00 AM
          <button onClick={handleBooking}>Book Now</button>
        </li>
        <li style={{ color: "green", display: "flex", gap: "10px" }}>
          Flight 2: | Goa → Chennai | 12:00 PM
          <button onClick={handleBooking}>Book Now</button>
        </li>
      </ul>
    </div>
  );
}
