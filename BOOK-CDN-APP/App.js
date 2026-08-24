import Book from "./Book";

const bookdata = [
  { image: "", title: "ReactJS", price: 465 },
  { image: "", title: "NodeJS", price: 571 },
  { image: "", title: "ExpressJS", price: 665 },
  { image: "", title: "ReactJS", price: 465 },
  { image: "", title: "NodeJS", price: 571 },
  { image: "", title: "ExpressJS", price: 665 },
];

function App() {
  const bookstore = bookdata.map((b) => {
    return Book(b);
  });

  return React.createElement(
    "div",
    {
      className: "bookstore",
    },
    bookstore,
  );
}

export default App;
