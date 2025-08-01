import React from "react";

export default function BookDetails(props) {
  return (
    <div>
      {props.books.map((book) => (
        <div key={book.id}>
          <h4>{book.bname}</h4>
          <h5>Rs. {book.price}</h5>
        </div>
      ))}
    </div>
  );
}
