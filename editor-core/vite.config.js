import { defineConfig } from 'vite';
import { resolve } from 'path';

export default defineConfig({
  root: './',
  base: './',
  publicDir: resolve(__dirname, '../../Mythic-Editor/public'),
  resolve: {
    alias: {
      '@mythic': resolve(__dirname, '../../Mythic-Editor/src'),
      'mythic-editor': resolve(__dirname, '../../Mythic-Editor/src'),
      'web-tree-sitter': resolve(__dirname, 'node_modules/web-tree-sitter/tree-sitter.js')
    }
  },
  server: {
    host: '0.0.0.0',
    port: 5173,
    cors: true
  },
  build: {
    outDir: resolve(__dirname, '../app/src/main/assets/editor'),
    emptyOutDir: true,
    rollupOptions: {
      input: resolve(__dirname, 'index.html'),
      output: {
        entryFileNames: 'assets/[name].js',
        chunkFileNames: 'assets/[name].js',
        assetFileNames: 'assets/[name].[ext]'
      }
    }
  }
});
