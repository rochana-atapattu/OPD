const Express=require('express');
const BodyParser=require('body-parser');
const Routes=require('./Routes');
const app=Express();

app.use(BodyParser.json());
app.use('/',Routes);



app.listen(8000,'localhost',function (err) {
    if(err){
        console.log(err);
        process.exit(-1);
    }
    console.log("Server listening to port 8000");
})