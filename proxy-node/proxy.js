const express = require('express');
const { createProxyMiddleware } = require('http-proxy-middleware');

const app = express();
const apiProxy = createProxyMiddleware('/api/v1/transaction', {
  target: 'http://localhost:8080',
  changeOrigin: true,
});

app.use('/api/v1/transaction', apiProxy);

app.listen(3000, () => {
  console.log('Reverse proxy running on port 3000.');
});

// node proxy.js to run the proxy server 