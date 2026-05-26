# Checks S1 CI Impact Proof

This repository is a controlled proof harness for the Checks CLI symlink scan-root
boundary. The base workflow creates a runner-owned Java source file outside the
checkout, then scans PR-controlled code with Checks.

The attack branch contributes only a Git symlink:

```text
MainActivity.java -> /tmp/checks-runner-owned/RunnerOwnedSecret.java
```

If Checks follows that symlink, the scan output should attribute runner-owned
source bytes to the PR-controlled in-repository path.
