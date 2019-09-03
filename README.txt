# Clemson Software Engineering Test Repository (CSPS 8710)

This is a demo repository that contains a small Java project with 
several methods.

## Useful initial setup commands:

'''
git config --global user.name "John Doe"
git config --global user.email johndoe@example.com
'''

## Useful git commands:

The following are some useful git commands. Here, exclude the [ ] brackets--
they are just intended to denote places where you need fill something in:

If you've changed some files and want to add them to the current change list, do:
'''git commit -am "[commit message with a short summary of work finished]"'''

Type this to check which branch you're currently working on
(default is usually called 'master'):
'''git branch'''

See which files are ready to be committed and which files were added but
remain un-tracked by git:
'''git status'''

If you have a totally new file added 'untracked' by git, you need to tell git to
track it; this can be done via:
'''git add [folder or filename, exclude the brackets]'''

When ready to update the online (origin) repository type this:
'''git push origin [branchname]'''
so if you're on the master branch you'd type:
'''git push origin master'''

If you want to create a new branch type:
* git checkout -b [new branchname]
So for example, if you want to fix a specific bug generally its good practice to
create a new branch as follows:
'''git checkout -b bug-fix'''
once you're satisfied that it is fixed, commit then push as follows:
'''
git commit -am "fixed an annoying bug, I'm finished with this branch for now"
git push origin bug-fix
'''


* git checkout [branchname]