import express from 'express' // importamos Express

const app = express() // Iniciamos Express
//Iniciamos servidor
app.listen('8000',function(){
    console.log('aplicacion iniciada en el puerto 8000');
})

//Configuracion pug
app.set('views','./vistas');
app.set('view engine', 'pug')

//Configuracion de archivos estaticos
app.use(express.static('./vistas'))
app.use(express.static('./src'))
app.use(express.static('./css'))

app.get('/', function(req,res){
    //res.send('aplicacion iniciada todo va bien');
    res.render('index',{titulo: 'Aplicacion de contactos',dato: 'cualquier texto'})
})