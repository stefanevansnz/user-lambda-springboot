#!/bin/bash
while true
do
	echo "Press [CTRL+C] to stop.."
    curl https://uladecfkba.execute-api.ap-southeast-2.amazonaws.com/Prod/getrandomuser/
	sleep 300
done

