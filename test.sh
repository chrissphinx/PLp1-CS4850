#!/usr/bin/env bash

if [ -z $1 ]; then
  echo "provide project subfolder!" >&2
  exit 1
fi

dir="../input/$1"
total=$(ls -1 $dir | wc -l)
passed=$total

for f in $dir/*; do
	echo -e "\033[33m$(basename $f)\033[0m:\033[1m"

	java -jar ../dist/PLp1.jar $f
  code=$?
  if [ $code == 1 ]; then let "passed -= 1"; fi
  if [ $code == 130 ]; then exit 130; fi

	echo -ne "\033[0m"
done

echo -e "\033[32m\033[1m$( echo "scale=2; x = $passed / $total; scale=0; x * 100 / 1" | bc )% PASSED\033[0m"
