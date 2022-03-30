# DemoProject
To practice GIT commands

To push a new project to github:

git init (Initializing GIT int he particular folder)

git add . (Addng the files to staging .... "." add all files)

git commit --message "MESSAGE" (Commiting the files to your local repo)

git remote add myLocalbranch "GIT_REMOTE_URL" (Hooking your local to remote)

git push myLocalbranch master (Pushing your local repos changes to remote repo)


If NON-FASTFORWARD error happens Do:

git fetch myLocalbranch

git merge myLocalbranch/master master

if this error happens "fatal: refusing to merge unrelated histories":

git merge myLocalbranch/master master (important-same format) --allow-unrelated-histories

git push myLocalbranch

