import "./App.css";
import { CalculateScore } from "./Components/CalculateScore.js";

function App() {
  return (
    <div className="App">
      <CalculateScore Name="Soham" School="ABC College" total={284} goal={3} />
    </div>
  );
}

export default App;
