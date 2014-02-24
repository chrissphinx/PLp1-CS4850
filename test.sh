#!/usr/bin/env bash

passed=33

for f in ../input/*
do
	echo -e "\033[33m$(basename $f)\033[0m:\033[1m"
	java -jar ../dist/PLp1Initial.jar $f 2>/dev/null || let "passed -= 1"
	echo -ne "\033[0m"
done

echo -e "\033[32m\033[1m$( echo "scale=2; x = $passed / 33; scale=0; x * 100 / 1" | bc )% PASSED\033[0m"
