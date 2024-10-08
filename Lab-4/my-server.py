from flash import Flask, request

app = Flask(__name__)

@app.route("/")
def hello():
    return " you called\n"

@app.route("/echo", method=['POST'])
def echo():
    return "You said: " + request.form['text']

if __name__ == "__main__":
    app.run(host="0.0.0.0")