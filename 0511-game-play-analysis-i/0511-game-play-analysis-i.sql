Select player_id, MIN(event_date) as first_login
From Activity
Group By player_id;