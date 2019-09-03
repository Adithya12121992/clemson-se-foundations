# Clemson Software Engineering Test Repository (CSPS 8710)

This is a demo repository that contains a small Java project with 
several methods.

## Useful initial setup commands:

```
git config --global user.name "John Doe"
git config --global user.email johndoe@example.com
```

## Useful git commands to remember:

*The following are some useful git commands. Here, exclude the [ ] brackets--
they are just intended to denote places where you need fill something in.*

### Inspecting tracked files and git repo status information

To see which files are ready to be committed and which files were added but
remain un-tracked by git, type:

```git status```

We can also see which branch we're currently working on by typing:

```git branch```

(note that the default is called 'master'):

### Adding and committing files

If you have a totally new file added 'untracked' by git, you need to tell git to
track it; this can be done as follows:

```git add [folder or filename, exclude the brackets]```

Once you've changed the files (and they are known and tracked by git) you can add them by 'committing':

```git commit -am "[commit message with a short summary of work finished]"```

### Updating origin

When ready to update your online (origin) repository type this:

```git push origin [branchname]```

so if you're on the master branch you'd type:

```git push origin master```

### Checking out and merging branches

If you want to create a new branch type:

 ```git checkout -b [new branchname]```

So, for example, if you want to fix a specific bug it's generally good practice to
create a new branch as follows:

```git checkout -b bug-fix```

then, once you're satisfied the issue is fixed, commit it, then push as follows:

```
git commit -am "fixed an annoying bug, I'm finished with this branch for now"
git push origin bug-fix
```

To merge a branch (say, the 'bug-fix') branch you can go repo's online page at [github.com](https://github.com/dtwelch/clemson-se-foundations) and submit a pull request by selecting the branch and pressing the green button labeled "pull request". This attempts to merge your changes (you'll be informed by the github website if there is some conflict).

There are probably already too many commands to remember here for newer users :-) . So keep this file merely as a reference. Stack Overflow and Google of course are also good resources for figuring out the more complicated commands.