import { useState } from "react";
import "./App.css";
import axios from "axios";

function App() {
  const [recipeLink, setRecipeLink] = useState("");

  function generateRecipe(e) {
    e.preventDefault();

    const enteredRecipeLink = recipeLink;
    console.log(enteredRecipeLink);
    axios
      .post("http://localhost:8080/recipe/parse-recipe", enteredRecipeLink, {
        headers: {
          "Content-Type": "application/json",
        },
      })
      .then((response) => {
        console.log(response.data);
      })
      .catch((error) => {
        console.error(error);
      })
      .finally(() => {
        console.log("Request completed");
      });
  }
  return (
    <>
      <section id="center">
        <div id="enterRecipeLink">
          <form method="post" onSubmit={generateRecipe}>
            <p>
              <input
                type="text"
                onChange={(e) => setRecipeLink(e.target.value)}
              ></input>
            </p>

            <button type="submit">Generate Recipe</button>
          </form>
        </div>
      </section>
    </>
  );
}

export default App;
