// Generated by Karakum - do not modify it manually!

@file:JsModule("node:cluster")

package node.cluster

/**
 * Clusters of Node.js processes can be used to run multiple instances of Node.js
 * that can distribute workloads among their application threads. When process isolation
 * is not needed, use the [`worker_threads`](https://nodejs.org/docs/latest-v22.x/api/worker_threads.html)
 * module instead, which allows running multiple application threads within a single Node.js instance.
 *
 * The cluster module allows easy creation of child processes that all share
 * server ports.
 *
 * ```js
 * import cluster from 'node:cluster';
 * import http from 'node:http';
 * import { availableParallelism } from 'node:os';
 * import process from 'node:process';
 *
 * const numCPUs = availableParallelism();
 *
 * if (cluster.isPrimary) {
 *   console.log(`Primary ${process.pid} is running`);
 *
 *   // Fork workers.
 *   for (let i = 0; i < numCPUs; i++) {
 *     cluster.fork();
 *   }
 *
 *   cluster.on('exit', (worker, code, signal) => {
 *     console.log(`worker ${worker.process.pid} died`);
 *   });
 * } else {
 *   // Workers can share any TCP connection
 *   // In this case it is an HTTP server
 *   http.createServer((req, res) => {
 *     res.writeHead(200);
 *     res.end('hello world\n');
 *   }).listen(8000);
 *
 *   console.log(`Worker ${process.pid} started`);
 * }
 * ```
 *
 * Running Node.js will now share port 8000 between the workers:
 *
 * ```console
 * $ node server.js
 * Primary 3596 is running
 * Worker 4324 started
 * Worker 4520 started
 * Worker 6056 started
 * Worker 5644 started
 * ```
 *
 * On Windows, it is not yet possible to set up a named pipe server in a worker.
 * @see [source](https://github.com/nodejs/node/blob/v22.x/lib/cluster.js)
 */


/* export * from "cluster"; */
/* export { default as default } from "cluster"; */
