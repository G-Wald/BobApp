FROM node:latest as build

WORKDIR /usr/local/app/

COPY ./ /usr/local/app/bobapp/front

RUN cd "bobapp"
RUN npm install
RUN npm run build
 
FROM nginx:latest as production

COPY front/nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=build /usr/local/app/dist/bobapp /usr/share/nginx/html

EXPOSE 80