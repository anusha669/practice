import iplDB 

if __name__ == "__main__":
    
    for ele in iplDB.players_in_team('CSK'):
        print(ele)

    # Team_Names = iplDB.get_team_names()
    # Team_Details = iplDB.get_team_details()
    # print(Team_Names)
    # for team in Team_Details:
    #     print(team)
    # for player in iplDB.get_all_players():
    #     print(player)
