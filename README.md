# A Mill plugin example

## Publish the plugin to local Ivy repo:

```bash
mill _.publishLocal
```

## Usage example:

```bash
$ cd usage-example
$ mill _.hello 1 2 3
[1/1] UsageExample.hello 
Hello, world! Args: List(1, 2, 3)
```