from flask import Flask, render_template, request
import json
import urllib.parse
import urllib.request

app = Flask(__name__)

@app.route("/", methods=["GET", "POST"])
def details():
    if request.method == "GET":
        return render_template("login.html")

 
if __name__ == "__main__":
    app.run(host="0.0.0.0", port=8080, debug=True)