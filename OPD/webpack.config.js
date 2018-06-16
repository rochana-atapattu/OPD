var path = require('path');
var HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
    entry: './src/index.jsx',
    output: {
        path: path.resolve('dist'),
        filename: 'bundle.js'
    },
    resolve: {
        extensions: ['.js', '.jsx']
    },
    module: {
        rules: [
            { test: /\.css$/, use: 'css-loader' },
            {

                test: /\.jsx?$/,
                use: {
                    loader: "babel-loader",
                    options: {
                        presets: ['react', 'es2015', 'stage-3']
                    }
                }
            }
        ]
    },
    plugins: [new HtmlWebpackPlugin({
        template: './src/index.html',
        filename: 'index.html',
        inject: 'body'
    })],
    devServer: {
        historyApiFallback: true
    }
}