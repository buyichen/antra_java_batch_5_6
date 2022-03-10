# Process vs Thread

| Process | Thread |
| --- | --- |
| Process means any program is in execution | Thread means segment of a process |
| Process takes more time to terminate | Thread takes less time to terminate |
| It takes more time for context switching. | It takes less time for context switching. |
| Process is less efficient in term of communication. | Thread is more efficient in term of communication. |
| Multi programming holds the concepts  of multi process. | We don’t need multi programs in action for multiple threads because a single process consists of multiple threads. |
| Process is isolated | Thread share memory |
| Process is called heavy weight process | A Thread is lightweight as each thread in a process share code, data and resource. |
| Process switching uses interface in operating system. | Thread switching does not require to call a operating system and cause an interrupt to the kernel. |
| If one process is blocked then it will not effect the execution of other process. | Second thread in the same task could not run, while one server thread is blocked. |
| Process has its own Process Control Block, Stack and Address Space. | Thread has Parents’ PCB, it own Thread Control Block and Stack and common Address Space. |
| If one process is blocked, then no other process can execute until the first process is unblocked. | While one thread is blocked and waiting, a second thread in the same task can run. |
| Changes to the parent process does not affect child processes. | Since all threads of the same process share address space and other resources so any changes to the main thread may affect the behavior of the other threads of the process. |