from flask import Flask, request, redirect, url_for, session, make_response, g

app = Flask(__name__)
app.secret_key = 'lab4'

user_data = {
    "th-token":"tahera.hoque"
}

@app.route("/")
def hello():
    if 'id' in session:
        user_id = session['id']
        return redirect(url_for("home"))
    return " you called\n" + \
        "<a href='/login'> login </a>"

@app.route("/echo", methods=['POST'])
def echo():
    return "You said: " + request.form['text']

def token_required(func):
    def decorator(*args, **kwargs):
        token = None
        if 'token' in request.headers:
            token = request.form['token']
        if not token:
            return make_response(jsonify({"token missing"}), 401)

        try: 
            user_id = user_data[token]
        except: 
            return make_response(jsonify({"invalid token"}), 401)
        
        return func(user_id, *args, **kwargs)
    return decorator

@token_required
@app.route("/home")
def home(): 
    return "Welcome " + user_id + "<br>" \
        "<a href='/logout'> logout </a>"

@app.route('/login', methods = ['GET', 'POST'])
def login():
    login_form = '''
    <form action = "" method = "post">
      <p><input type = text name = id/></p>
      <p<<input type = submit value = Login/></p>
    </form>
    '''
    
    if request.method == "POST":
        session['id'] = request.form['id']
        token = request.form['id']
        return redirect(url_for('home'))
    
    else: 
        return login_form

@app.route('/logout')
def logout():
    session.pop('id', None)
    return redirect(url_for(''))

if __name__ == "__main__":
    app.run(host="0.0.0.0")
