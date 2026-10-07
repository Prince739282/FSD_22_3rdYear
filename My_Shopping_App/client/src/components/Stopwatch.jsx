import React, { useEffect, useState } from "react";

function Stopwatch() {
  const [running, setRunning] = useState(false);
  const [timer, setTimer] = useState(0);
  function handleRunning() {
    setRunning(!running);
  }
  function reset() {
    setTimer(0);
  }
  useEffect(() => {
    let interval;
    if (running) {
      interval = setInterval(() => {
        setTimer((prev) => prev + 10);
      }, 10);
    }
    return () => clearInterval(interval);
  }, [running]);

  const min = Math.floor(timer / 60000);
  const sec = Math.floor((timer % 60000) / 1000);
  const ms = timer % 1000;

  return (
    <div>
      <div className="Stopwatch">
        <h1>Stopwatch</h1>
        <div id="min">{min}</div>
        <div id="sec">{sec}</div>
        <div id="ms">{ms}</div>
        <button className="btn" onClick={handleRunning}>
          {running ? "STOP" : "START"}
        </button>
        <button className="btn" onClick={reset}>
          RESET
        </button>
      </div>
    </div>
  );
}

export default Stopwatch;
