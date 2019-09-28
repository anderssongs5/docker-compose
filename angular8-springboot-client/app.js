const express = require('express');
const path = require('path');
const http = require('http');

const app = express();
const port = process.env.PORT || 3001;

app.use(express.static(__dirname + '/employees-client'));

app.get('/*', (req, res) => res.sendFile(path.join(__dirname)));

const server = http.createServer(app);

server.listen(port, () => console.log('Running app...'))
