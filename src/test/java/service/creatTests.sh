#!/bin/bash

while true; do
    # Specify the folder from which you want to copy the first file
    source_folder="."
    
    # Get the name of the first file in the source folder
    filename="$(ls $source_folder | head -n 1)"
    
    # Generate a random string of characters
    random_string=$(cat /dev/urandom | tr -dc 'a-zA-Z' | fold -w 10 | head -n 1)
    
    # Get the extension of the file
    extension="${filename##*.}"
    
    # Construct the new filename with the random string
    new_filename="$random_string.$extension"
    
    # Copy the file to the same folder with the new filename
    cp "$source_folder/$filename" "$source_folder/$new_filename"
    
    # Wait for some time before running again
    sleep 5
done

