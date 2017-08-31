var ws=new WebSocket("ws://localhost/ws");
ws.onopen=function()
{
ws.send("send a message");
}
ws.onmessage=function(event)
{
console.log("message received:"+event.data);
}
ws.onclose=function(event)
{
console.log("closed:"+event.code);
}
