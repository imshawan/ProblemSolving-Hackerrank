# 1. REST API: Total Goals by a Team

In this challenge, the REST API contains information about football matches. The provided API allows querying matches by teams and year. Your task is to get the total number of goals scored by a given team in a given year.

For example, a GET request to

https://jsonmock.hackerrank.com/api/football_matches?year=2011&team1=Barcelona&page=2 returns data associated with matches in the year 2011, where team1 (the home team) was Barcelona, on the second page of the results.

Similarly, a GET request to

https://jsonmock.hackerrank.com/api/tpotballmatches?year=2011&team2-Barcelona&page=1 returns data associated with matches in the year 2011 where team2 (the visiting team) was Barcelona, on the first page of the results.

The response to such a request is a JSON with the following 5 fields:

* page: The current page of the results.

* per_page: The maximum number of matches returned per page.

* total: The total number of matches on all pages of the results.

* total pages: The total number of pages with results.

* data: An array of objects containing matches information on the requested page.

Each match record has several fields, but in this task only the following 4 are relevant:

* team1: a string denoting the name of the first team in the match.

* team2: a string denoting the name of the second team in the match.

* teamigoals: a string denoting the number of goals scored by team1 in the match.

* team2goals: a string denoting the number of goals scored by team2 in the match.


# 2. REST API: Number of Drawn Matches

In this challenge, the REST API contains information about football matches. The provided API allows querying matches by teams and year. The task is to get the number of matches for a given year that ended in a draw. A match is drawn when both teams scored the same number of goals.

For example, a GET request to

https://jsonmock.hackerrank.com/api/football_matches?year=2011&page=2 
returns data associated with matches in the year 2011 on the second page of the results.

The response to such a request is a JSON with the following 5 fields:

* page: The current page of the results.

* per_page: The maximum number of matches returned per page.

* total: The total number of matches on all pages of the results.

* total_pages: The total number of pages with results. 

* data: An array of objects containing matches information on the requested page.

Each match record has several fields:

* competition: a string denoting the name of the CO tition

* year; an integer denoting the year when the match took place.

* round: a string denoting the round the match belongs to (can be an empty string)

* team1: a string denoting the name of the first team in the match

* team2: a string denoting the name of the second team in the match

* team1goals: a string denoting the number of goals scored by team1 in the match 

* team2goals: a string denoting the number of goals scored by team2 in the match.

For example, performing a request to https://jsonmock.hackerrank.com/api/football_matches?year=2011&team1goals=1&page=2 returns data associated with matches in the year 2011, where the first team scored 1 goal, on the second page of the results.