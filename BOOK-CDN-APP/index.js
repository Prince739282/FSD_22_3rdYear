function Book(){
    const image =React.createElement("img", {src:"",width: "100px", height:"100px"},null);
    const title = React.createElement("h2", {color: "red" },"Title:ReactJS");
    const price = React.createElement("h2", { color: "blue" }, "Price:435/-");
    const btn = React.createElement("button", { color: "Green" }, "AddToCart");
    const div = React.createElement("div", { className:"book" }, [image,title,price,btn]);




}