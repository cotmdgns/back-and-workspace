select * from membership;
select * from membership_location;
select * from membership_type;
select * from location_category;
select * from type_category;

drop schema moim;
create schema moim;

INSERT INTO membership (membership_name, membership_img, membership_info, membership_date, membership_grade, membership_max) VALUES
('Adventure Club', 'adventure.jpg', 'A club for outdoor enthusiasts.', '2024-08-01', 4.5, 50),
('Music Lovers', 'music.jpg', 'For those who love music.', '2024-08-02', 4.7, 100),
('Tech Innovators', 'tech.jpg', 'Innovative minds in technology.', '2024-08-03', 4.6, 75),
('Foodies United', 'foodies.jpg', 'A community for food enthusiasts.', '2024-08-04', 4.8, 40),
('Book Worms', 'books.jpg', 'For book lovers and readers.', '2024-08-05', 4.3, 60),
('Fitness Freaks', 'fitness.jpg', 'For those passionate about fitness.', '2024-08-06', 4.9, 30),
('Travel Seekers', 'travel.jpg', 'Explorers and travelers.', '2024-08-07', 4.2, 80),
('Gaming Pros', 'gaming.jpg', 'For gaming enthusiasts and pros.', '2024-08-08', 4.4, 90),
('Art Aficionados', 'art.jpg', 'Art lovers and creators.', '2024-08-09', 4.6, 55),
('Cinema Buffs', 'cinema.jpg', 'Film lovers and critics.', '2024-08-10', 4.1, 65),
('Science Club', 'science.jpg', 'For those passionate about science.', '2024-08-11', 4.7, 70),
('History Buffs', 'history.jpg', 'History enthusiasts and researchers.', '2024-08-12', 4.5, 50),
('Outdoor Explorers', 'outdoor.jpg', 'For those who enjoy outdoor activities.', '2024-08-13', 4.8, 45),
('Culinary Creators', 'culinary.jpg', 'Cooking and culinary arts enthusiasts.', '2024-08-14', 4.3, 60),
('Spiritual Seekers', 'spiritual.jpg', 'A club for spiritual growth.', '2024-08-15', 4.4, 70),
('DIY Enthusiasts', 'diy.jpg', 'Do-it-yourself projects and crafts.', '2024-08-16', 4.6, 50),
('Language Learners', 'language.jpg', 'For those learning new languages.', '2024-08-17', 4.2, 80),
('Pet Lovers', 'pets.jpg', 'For animal and pet lovers.', '2024-08-18', 4.5, 55),
('Nature Walkers', 'nature.jpg', 'Those who love nature walks.', '2024-08-19', 4.7, 65),
('Sports Fans', 'sports.jpg', 'Fans of various sports.', '2024-08-20', 4.4, 75),
('Health Gurus', 'health.jpg', 'Experts in health and wellness.', '2024-08-21', 4.6, 50),
('Music Makers', 'music_makers.jpg', 'Musicians and music creators.', '2024-08-22', 4.8, 60),
('Hiking Group', 'hiking.jpg', 'For hiking enthusiasts.', '2024-08-23', 4.3, 70),
('Gardening Club', 'gardening.jpg', 'Gardening and horticulture lovers.', '2024-08-24', 4.5, 40),
('Cultural Enthusiasts', 'cultural.jpg', 'Exploring different cultures.', '2024-08-25', 4.7, 80),
('Tech Gadgets', 'gadgets.jpg', 'Fans of the latest tech gadgets.', '2024-08-26', 4.6, 90),
('Mindfulness Group', 'mindfulness.jpg', 'Practicing mindfulness and meditation.', '2024-08-27', 4.4, 60),
('Photography Club', 'photography.jpg', 'Photography and visual arts enthusiasts.', '2024-08-28', 4.8, 50),
('Sustainable Living', 'sustainable.jpg', 'Living sustainably and eco-friendly.', '2024-08-29', 4.7, 55),
('Cultural Arts', 'cultural_arts.jpg', 'Arts from various cultures.', '2024-08-30', 4.3, 65),
('Adventure Seekers', 'adventure_seekers.jpg', 'For thrill-seekers and adventurers.', '2024-08-31', 4.6, 70),
('Wine Lovers', 'wine.jpg', 'Enthusiasts of fine wines.', '2024-09-01', 4.5, 45),
('Craft Beer Club', 'craft_beer.jpg', 'Fans of craft beers.', '2024-09-02', 4.4, 50);

INSERT INTO membership_type (type_code, membership_code) VALUES
(1, 1), (2, 1), (3, 2), (4, 2), (5, 3), (6, 3),
(7, 4), (8, 4), (9, 5), (10, 5), (11, 6), (12, 6),
(13, 7), (14, 7), (15, 8), (16, 8), (17, 9), (18, 9),
(19, 10), (20, 10), (21, 11), (22, 11), (23, 12), (24, 12),
(25, 13), (26, 13), (27, 14), (28, 14), (29, 15), (30, 15);

INSERT INTO membership_location (loc_code, membership_code) VALUES
(1, 1), (2, 1), (3, 2), (4, 2), (5, 3), (6, 3),
(7, 4), (8, 4), (9, 5), (10, 5), (11, 6), (12, 6),
(13, 7), (14, 7), (15, 8), (16, 8), (17, 9), (18, 9),
(19, 10), (20, 10), (21, 11), (22, 11), (23, 12), (24, 12),
(25, 13), (26, 13), (27, 14), (28, 14), (29, 15), (30, 15);



select * from membership;
select * from membership_location;
select * from membership_type;
select * from location_category;
select * from type_category;


SELECT * FROM membership
join membership_location USING(membership_code)
join location_category USING(loc_code)
join membership_type USING(membership_code)
join type_category USING(type_code)
where loc_la_name = '서울'; 



SELECT * FROM membership
join membership_location USING(membership_code)
join location_category USING(loc_code)
join membership_type USING(membership_code)
join type_category USING(type_code)
where loc_la_name = '서울';




SELECT * FROM location_category
join membership_location USING (loc_code)
join membership USING (membership_code)
join membership_type USING (membership_code)
join type_category USING(type_code);
