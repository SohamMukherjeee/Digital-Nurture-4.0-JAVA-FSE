import React, { useState } from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {
  const [section, setSection] = useState("books");

  const bookList = [
    { id: 101, bname: "Master React", price: 670 },
    { id: 102, bname: "Deep Dive into Angular 11", price: 800 },
    { id: 103, bname: "Mongo Essentials", price: 450 },
  ];

  const renderSection = () => {
    switch (section) {
      case "books":
        return <BookDetails books={bookList} />;
      case "blogs":
        return <BlogDetails />;
      case "courses":
        return <CourseDetails />;
      default:
        return <p>Please select a section.</p>;
    }
  };

  return (
    <div style={{ fontFamily: "Arial", padding: "20px" }}>
      <h1>Blogger App</h1>
      <div style={{ display: "flex", gap: "15px", marginBottom: "20px" }}>
        <button
          onClick={() => setSection("books")}
          disabled={section === "books"}
        >
          Book Details
        </button>
        <button
          onClick={() => setSection("blogs")}
          disabled={section === "blogs"}
        >
          Blog Details
        </button>
        <button
          onClick={() => setSection("courses")}
          disabled={section === "courses"}
        >
          Course Details
        </button>
      </div>

      <hr />

      {renderSection()}
    </div>
  );
}

export default App;
