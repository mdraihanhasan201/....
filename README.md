# ....y_name=input("enter your full name:\n")
h_S_name=input(" enter their full name:\n")
combined_name=y_name+h_S_name
lower_case_string=combined_name.lower()

t=lower_case_string.count("t")
r=lower_case_string.count("r")
u=lower_case_string.count("u")
e=lower_case_string.count("e")
true=t+r+u+e

l=lower_case_string.count("l")
o=lower_case_string.count("o")
v=lower_case_string.count("v")
e=lower_case_string.count("e")

love=l+o+v+e

love_score=str(true)+str(love)
print(F"your love score is : {love_score}%")
#love_score_count_games
