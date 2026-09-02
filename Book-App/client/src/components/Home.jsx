import React from "react";
import Book from "./Book";

const Home = () => {
  const bookdata = [
    { image: "", title: "ReactJS", price: 375 },
    { image: "", title: "ReactJS", price: 375 },
    { image: "", title: "ReactJS", price: 375 },
  ];

  return (
    <div className="home">
      <div className="bookstore">
        {bookdata.map((b, index) => {
          return <Book key={index} props={b} />;
        })}
      </div>
    </div>
  );
};

export default Home;
