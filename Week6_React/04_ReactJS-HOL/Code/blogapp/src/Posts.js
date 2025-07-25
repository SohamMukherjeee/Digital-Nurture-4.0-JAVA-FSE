import React from "react";
import Post from "./Post";

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      isError: false,
    };
  }
  //1
  loadPosts = () => {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => {
        const postObjs = data.map((p) => new Post(p.id, p.title, p.body));
        this.setState({ posts: postObjs });
      })
      .catch((error) => {
        console.error("Error:", error);
        this.setState({ isError: true });
      });
  };
  //2
  componentDidMount() {
    this.loadPosts();
  }

  //3
  render() {
    return (
      <div>
        <h1>Blogs</h1>
        {this.state.posts.map((post) => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
  //4
  componentDidCatch(error, info) {
    alert("An error occurred while displaying posts.");
    console.error("Error caught in component:", error, info);
  }
}

export default Posts;
