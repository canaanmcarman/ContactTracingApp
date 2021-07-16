This app will prompt a user for their personal info and covid symptoms, then ask
for info on people they have come into contact of. This information will be
displayed all together in the console at the end.

Begin
    create patient object and store personal information
    prompt user for name
    get name
    prompt user for phone number
    get phone number
    prompt user for email
    get email
    prompt user for city
    get city
    prompt user for state
    get state

    prompt user for each individual symptom of covid
    if patient has symptom
        prompt user "how many days have you had this symptom?"
        get days of symptom and store in covid symptoms array

    prompt user if they have contacted anyone
    get answer
    while answer is yes
        create contacted person object
        prompt for name, email and phone number
        get name, email and phone and add to contacted person object
        prompt user if the contacted anyone else
        get answer

    display patients info
    display patients contacted people and their info
End

    

