from flask import Flask, request, redirect, g

app = Flask(__name__)

@app.route("/")
def hello():
    return " you called\n"

@app.route("/echo", methods=['POST'])
def echo():
    return "You said: " + request.form['text']


def login_required(func):
    def decorated_func(*args, **kwargs):
        if g.user is None:
            return redirect(url_for("login", next=request.url))
        return func(*args, **kwargs)
    return decorated_func

@app.route("/private")
@login_required
def home():
   return "Welcome " + user_id + " }:^]"

@app.route("/login", methods=['GET', 'POST'])
def login():
    if request.method == "GET":
        

if __name__ == "__main__":
    app.run(host="0.0.0.0")
