import express,{Request, Response} from "express";
import path from "path";

const app = express();
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, "/views"));

app.get('/', function (request:Request, response: Response) {
    fetch("https://pokeapi.co/api/v2/pokemon?limit=151")
        .then(function (res) {
            return res.json();
        })
        .then(function (data) {
            response.render("index", data);
        });
});

app.get('/pokemon/:name', function (request:Request, response: Response) {
    const {name} = request.params;
    fetch(`https://pokeapi.co/api/v2/pokemon/${name}`)       
        .then(function (res) {
            return res.json();
        })
        .then(data => {
            response.render('pokemons',{name, pokemon: data});
        });
});


app.listen(3000, function () {
    console.log("Server is running");
})