from pymongo import MongoClient

url = "mongodb+srv://dbUser:dbUserPassword@cluster0-bvwiz.mongodb.net/test?retryWrites=true&w=majority"
client = MongoClient(url)
db = client.IPL2021

def get_team_labels():
    collection = db.iplTeam1
    teamLabels = []
    # teamNames = [x["team"] for x in collection.find({},{"_id":0,"team":1})]
    for x in collection.find({},{"_id":0,"label":1}):
        teamLabels.append(x["label"])
    return teamNames

def get_team_details():
    collection = db.iplTeam1
    teamDetails = []
    for team in collection.find({}):
        teamDetails.append(team)
    return teamDetails

def get_all_players():
    collection = db.player 
    players = []
    for player in collection.find({},{"_id":0}):
        players.append(player)
    return players

def players_in_team(teamName):
    collection = db.player
    players_team = []
    for player in collection.find({"label":teamName}):
        players_team.append(player)
    return players_team
