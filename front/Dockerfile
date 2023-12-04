FROM node:latest as build

WORKDIR /usr/local/app/
#front/dist/bobapp
RUN echo "***********************************************************************************"
RUN file="$(ls)" && echo $file
RUN echo "***********************************************************************************"

COPY ./usr/local/app/front/package.json .

RUN npm install
COPY . ./


#COPY ./ /usr/local/app/front/dist/bobapp

#RUN yarn
RUN npm run build
 
FROM nginx:latest as production

COPY --from=build /usr/local/app/nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=build /usr/local/app/dist/bobapp /usr/share/nginx/html

EXPOSE 80