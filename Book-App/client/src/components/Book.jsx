import React from "react";
import image from "../assets/react.svg";
import "./Book.css";

const Book = ({ props }) => {
  return (
    <div className="book">
      <img src={image} width="100" height="100" alt="Book Image" />

      <h2>Title: {props.title}</h2>
      <h2>Price: ₹{props.price}</h2>

      <button style={{widht:"100",height:"50px", color:"blue"}}>Add To Cart</button>
    </div>
  );
};

export default Book;
