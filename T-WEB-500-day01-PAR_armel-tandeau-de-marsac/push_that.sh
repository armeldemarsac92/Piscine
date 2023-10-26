#! /bin/bash
if [ -n "$1"]
then
	echo "manque un message de commit"
else
	git add .
	git commit -m "$1"
	git push
	echo "push effectué"
fi
