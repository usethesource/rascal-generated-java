# Rascal Developer Manual: generated code

## Updating the generated code

This repository contains Java code that is generated from Rascal modules.
It is incorporated in the Rascal repository as a Git submodule.
The Rascal project provides a command-line tool to perform code generation.
For reproducibility, this tool should be called from a released version of Rascal (i.e., using a released Rascal Jar, for instance obtained from a local `.m2` repository, or from the [release server](https://releases.usethesource.io/maven/org/rascalmpl/rascal/)).

To update the generated code, execute the following steps.
1. Navigate to the root of the `rascal` repository and run the compiler (e.g., `java -cp ~/.m2/repository/org/rascalmpl/rascal/0.43.3/rascal-0.43.3.jar org.rascalmpl.shell.RascalGenerateSources`). Please make sure that the repository is "clean" before generation.
2. Navigate into the `generated` directory, commit the changes and push them to the remote repository. Please include the (Rascal) commit hash in the commit message. Note that the changes are pushed to the `rascal-generated-java` repository, **not** to the `rascal` repository itself.
3. Navigate back to the `rascal` repository root. A `git diff` will now flag that the `generated` directory has upstream changes (one entry indicating `modified:   generated (new commits)`). To use the newly generated code in the Rascal project, run `git add generated` to update the submodule's commit pointer and open a PR on the `rascal` project.
