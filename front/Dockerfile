# Phase de construction
FROM node:latest as build

WORKDIR /usr/local/app/front

COPY ./front /usr/local/app

RUN npm install
RUN npm run build

# Phase de production
FROM nginx:latest as production

COPY ./front/nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=build /usr/local/app/dist/bobapp /usr/share/nginx/html

EXPOSE 80