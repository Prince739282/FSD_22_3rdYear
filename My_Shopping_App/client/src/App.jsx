import React from "react";
import UserLayout from "./pages/UserLayout";
import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Stopwatch from "./components/stopwatch";
function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<UserLayout />} />
          <Route path="/myorder" element={<h1>Myorder</h1>} />
          <Route path="/mycart" element={<h1>mycart</h1>} />
          <Route path="/home" element={<h1>home</h1>} />
          <Route path="/about" element={<h1>about</h1>} />
          <Route path="/stopwatch" element={<Stopwatch />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
